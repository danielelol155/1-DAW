--1. El nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT Clientes.NombreCliente AS Cliente, CONCAT(Empleados.Nombre," ",Empleados.Apellido1," ",Empleados.Apellido2) AS Representante, Oficinas.Ciudad as Ciudad_Oficinas
    FROM Clientes, Empleados, Oficinas
        WHERE Clientes.CodigoEmpleadoRepVentas = Empleados.CodigoEmpleado AND Empleados.CodigoOficina = Oficinas.CodigoOficina;
