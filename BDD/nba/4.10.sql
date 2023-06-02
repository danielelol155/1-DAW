-- 1) Listado de clientes indicando el nombre del cliente y cuántos pedidos ha realizado
SELECT clientes.NombreCliente, count(pedidos.CodigoPedido) as Numero_Pedidos FROM clientes, pedidos 
WHERE clientes.CodigoCliente=pedidos.CodigoCliente GROUP BY clientes.NombreCliente;
-- 2) Un listado con los nombres de los clientes y el total pagado por cada uno de ellos
SELECT clientes.NombreCliente, sum(pagos.Cantidad) as Total_Pagado FROM clientes, pagos WHERE clientes.CodigoCliente=pagos.CodigoCliente 
GROUP BY clientes.NombreCliente ORDER BY clientes.NombreCliente;

-- 3) El nombre de los clientes que hayan hecho pedidos en 2008
SELECT clientes.NombreCliente FROM clientes, pagos WHERE pagos.FechaPago LIKE '2008%';

-- 4) El nombre del cliente y el nombre y apellido de sus representantes de aquellos clientes que no hayan realizado pagos
SELECT clientes.NombreCliente, concat(empleados.Nombre, " ", empleados.Apellido1, " ", empleados.Apellido2) as Representante FROM clientes, empleados 
WHERE clientes.CodigoEmpleadoRepVentas=empleados.CodigoEmpleado and CodigoCliente NOT IN (SELECT CodigoCliente FROM Pagos);
    
-- 5) Un listado de clientes donde aparezca el nombre de su comercial y la ciudad donde está su oficina
SELECT clientes.NombreCliente, concat(empleados.Nombre, " ", empleados.Apellido1, " ", empleados.Apellido2) as Nombre_Comercial, oficinas.ciudad
FROM clientes, empleados, oficinas
WHERE clientes.CodigoEmpleadoRepVentas=empleados.CodigoEmpleado AND empleados.CodigoOficina=oficinas.CodigoOficina;

-- 6) El nombre, apellidos, oficina y cargo de aquellos que no sean representantes de ventas
SELECT concat(empleados.Nombre, ' ', empleados.Apellido1, ' ', empleados.Apellido2) as Nombre_Empleado, empleados.Puesto FROM empleados
WHERE Puesto<>"Representante Ventas";

-- 7) Cuántos empleados tiene cada oficina, mostrando el nombre de la ciudad donde está la oficina
SELECT sum(CodigoEmpleado) as Suma_Empleados, oficinas.Ciudad FROM empleados, oficinas 
WHERE empleados.CodigoOficina=oficinas.CodigoOficina GROUP BY oficinas.CodigoOficina ORDER BY oficinas.CodigoOficina;

-- 8) Un listado con el nombre de los empleados, y el nombre de sus repectivos jefes
SELECT empleados.nombre as Nombre_Empleado, jefes.nombre as Nombre_Jefe
FROM empleados, empleados as jefes
WHERE empleados.CodigoEmpleado=jefes.CodigoJefe;

-- 9) El nombre, apellido, oficina (ciudad) y cargo del empleado que no represente a ningún cliente
SELECT empleados.Nombre, empleados.Apellido1, oficinas.Ciudad, empleados.Puesto FROM empleados, oficinas, clientes
WHERE empleados.CodigoOficina=oficinas.CodigoOficina AND empleados.CodigoEmpleado<>clientes.CodigoEmpleadoRepVentas;

-- 10) La media de unidades en stock de los productos agrupados por gama
SELECT AVG(productos.CantidadEnStock) as Media_Unidades_Stock, productos.Nombre FROM productos GROUP BY productos.Gama;

-- 11) Los clientes que residan en la misma ciudad donde hay una oficina, indicando dónde está la oficina
SELECT clientes.NombreCliente, clientes.Ciudad as Ciudad_Residencia, oficinas.Ciudad as Ciudad_Oficina FROM clientes, oficinas, empleados
WHERE clientes.CodigoEmpleadoRepVentas=empleados.CodigoEmpleado AND empleados.CodigoOficina=oficinas.CodigoOficina AND oficinas.Ciudad=clientes.Ciudad
ORDER BY clientes.Ciudad;

-- 12) Los clientes que residan en ciudades donde no hay oficinas ordenado por la ciudad donde residen
SELECT clientes.NombreCliente, clientes.Ciudad, oficinas.Ciudad FROM clientes, oficinas, empleados
WHERE clientes.CodigoEmpleadoRepVentas=empleados.CodigoEmpleado AND empleados.CodigoOficina=oficinas.CodigoOficina AND oficinas.Ciudad<>clientes.Ciudad
ORDER BY clientes.Ciudad;

-- 13) El número de clientes que tiene asignado cada representante de ventas
SELECT count(clientes.CodigoCliente) as Numero_Clientes, concat(empleados.Nombre, ' ', empleados.Apellido1, ' ', empleados.Apellido2) as Representante_Ventas FROM clientes, empleados
WHERE clientes.CodigoEmpleadoRepVentas=empleados.CodigoEmpleado GROUP BY clientes.CodigoEmpleadoRepVentas;

-- 14) Cuál fue el cliente que hizo el pago con menor cuantía
SELECT MIN(pagos.Cantidad) as menorCuantia, clientes.CodigoCliente
FROM pagos NATURAL JOIN clientes;

-- 15) Un listado con el precio total de cada pedido
SELECT pedidos.CodigoPedido as Pedido, sum(Cantidad*PrecioUnidad) as Total
FROM pedidos, join detallepedidos
WHERE pedidos.CodigoPedido=detallepedidos.CodigoPedido
GROUP BY Pedidos.CodigoPedido
-- para que muestren a partir de 1000 en el total
having total>1000
ORDER BY Total;

-- 16) Los clientes que hayan hecho pedidos en 2008 por una cuantía superior a 2000 euros
SELECT clientes.CodigoCliente,  pedidos.FechaPedido, pagos.Cantidad
FROM clientes, pedidos, pagos
WHERE clientes.CodigoCliente=pedidos.CodigoCliente
AND clientes.CodigoCliente=pagos.CodigoCliente
AND pedidos.FechaPedido BETWEEN '2008-01-01' AND '2008-12-12'
AND pagos.Cantidad>'2000';

-- 17) Cuántos pedidos tiene cada cliente en cada estado
SELECT NombreCliente as Cliente, Estado, count(CodigoPedido)
FROM clientes join pedidos
where clientes.CodigoCliente=pedidos.CodigoCliente
GROUP BY clientes.CodigoCliente, Estado;

-- 18) Los clientes que han pedido más de 200 unidades de cualquier producto
SELECT clientes.CodigoCliente, detallepedidos.Cantidad
FROM clientes, detallepedidos, pedidos
WHERE clientes.CodigoCliente=pedidos.CodigoCliente
AND pedidos.CodigoPedido=detallepedidos.CodigoPedido
AND detallepedidos.Cantidad>'200';