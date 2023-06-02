--1.La ciudad y telefono de las oficinas de EE.UU
SELECT Ciudad, Telefono FROM 'Oficina' WHERE Pais = 'EEUU';
--2.nombre, apellidos y email de los empleados a cargo de alberto soria
SELECT CONCAT(Apellido1," ", Apellido2," ", Email) AS Subordinados_de_Alberto_Soria FROM 'Empleados' WHERE CodigoJefe (SELECT CodigoEmpleado FROM Empleados WHERE Nombre= 'Alberto' AND Apellido1 = 'Soria' )0
--3. el puesto, nombre, apellidos y email jefe de la empresa
SELECT Puesto, Nombre, Apellido1, Email FROM Empleados;
--4. nombre, apellidos y cargo de aquellos que no sean representantes de ventas
SELECT Nombre, Apellidos FROM Empleados WHERE Puesto = 
--5. el numero de clientes que tiene la empresa
SELECT COUNT (*) FROM Cliente;
--6. el nombre de los clientes españoles
SELECT nombre FROM Clientes WHERE Pais = 'España';
--7. el nombre de los clientes de cada país
SELECT nombre FROM Clientes WHERE Pais;
--8. cuantos clientes tiene la ciudad de Madrid
SELECT COUNT CodigoCliente  FROM Clientes WHERE Ciudad = 'Madrid';
--9. cuantos clientes tiene la ciudades que empiezan por M
SELECT COUNT CodigoCliente FROM Cliente WHERE NombreCliente like 'M%';
--10. El código de empleado y el numero de clientes al que atiende cada representante de ventas
SELECT CodigoEmpleadoVentas, COUNT(*) as numero_Clientes FROM Clientes GROUP BY CodigoEmpleadoVentas;
--11. El numero de clientes que nno tiene asignado representante de ventas.
SELECT Clientes (*) FROM cliente WHERE CodigoEmpleadoVentas is NULL;
--12. Cual fue el primer y ultimo pago que hizo algun cliente.
SELECT CodigoCliente, MAX(Fecha) AS Ultimo_pago, MIN(Fecha) AS Primer_pago FROM PagoCliente GROUP BY CodigoCliente;
--13. El código de cliente de aquellos clientes que hicieron pafos en 2008.
SELECT CodigoCliente FROM Cliente WHERE Fecha = '2008-01-01';
--14. Los distintos estados por los que puede pasar un pedido.
SELECT Estado FROM Pedido;
--15. El número de pedido, código de cliente, fecha requerida y fecha de entrega de los pedidos que no han sido entregados a tiempo.
SELECT COUNT(*) AS Numero_pedido, CodigoCliente, FechaRequerida, FechaEntregada FROM Pedido WHERE FechaEntregada is NULL;
--16. Cuántos productos existen en cada línea de pedido.

--17. Un listado de los 20 códigos de productos más pedidos ordenado por cantidad pedida.
SELECT CodigoProducto, COUNT(CodigoProducto) AS Cantidad FROM Pedido GROUP BY CodigoProducto ORDER BY Cantidad DESC LIMIT 20;
--18 El número de pedido, código de cliente, fecha requerida y fecha de entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha requerida.
;
--19. La facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el IVA y el total facturado.
