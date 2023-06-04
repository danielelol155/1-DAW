--1. El nombre del producto más caro
SELECT Nombre FROM Productos WHERE PrecioVenta = (SELECT = MAX(PrecioVenta) FROM Productos);
--2. El nombre del producto del  que más unidades se hayan vendido en un mismo pedido
SELECT Nombre  FROM Productos WHERE CodigoProducto = (SELECT CodigoProducto FROM DetallePedidos);
--3. Los clientes cuya línea de crédito sea mayor que los pagos que haya realizado.
SELECT Nombre FROM Clientes WHERE NumeroCuenta > (SELECT SUM(Pago) FROM DetallePedidos);
--4. El producto que más unidades tiene en stock y el que menos unidades tiene.
SELECT Nombre FROM Productos WHERE Stock = (SELECT MAX(Stock) FROM Productos);