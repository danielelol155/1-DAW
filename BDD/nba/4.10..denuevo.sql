--1
SELECT clientes.NombreCliente, count(pedidos.CodigoPedido)
FROM clientes, pedidos
WHERE clientes.CodigoCliente = pedidos.CodigoCliente
GROUP BY clientes.NombreCliente;
--2
SELECT clientes.NombreCliente, sum(pagos.Cantidad)
FROM clientes, pagos
WHERE clientes.CodigoCliente = pagos.CodigoCliente
GROUP BY clientes.NombreCliente;
--3
SELECT clientes.NombreCliente
FROM clientes, pagos 
WHERE pagos.FechaPago LIKE '2008%'
GROUP BY clientes.NombreCliente;
--4
SELECT clientes.nombrecliente, concat(empleados.nombre, " ", empleados.Apellido1, " ", empleados.Apellido2)
FROM clientes, empleados
WHERE clientes.CodigoEmpleadoRepVentas= empleados.CodigoEmpleado
GROUP BY clientes.NombreCliente;