--3 Nombre, apellidos y Email de empleados a cargo de Juan Martinez
SELECT CONCAT(nombre," ",Apellido1," ",Apellido2) as "nombre y apellidos",Email 
FROM empleados
WHERE CodigoJefe = (
    SELECT CodigoEmpleado
    FROM empleados
    WHERE nombre = "Alberto"
    AND Apellido1 = "Soria"
);
--4 Nombre, Apellidos y cargo de aquellos empleados que no tienen ningun cliente a su cargo
SELECT concat(empleados.nombre," ",empleados.apellido1," ",empleados.Apellido2) as "nombre", empleados.cargo as "cargo"
FROM empleados, clientes
WHERE empleados.CodigoEmpleado NOT IN (
    SELECT empleados.CodigoEmpleado
    FROM clientes, empleados
    WHERE empleados.CodigoEmpleado = clientes.CodigoEmpleadoRepVentas
    );