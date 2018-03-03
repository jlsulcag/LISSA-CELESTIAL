--Query que permite a hibernate trabajar con diversos esquemas
SHOW search_path
ALTER DATABASE clinicadb SET search_path = farmacia,public;

--Deletes
delete from detalle_compra;
delete from compra;
delete from detalle_venta;
delete from venta;
delete from detalle_kardex;
delete from kardex;
delete from almacen_producto;

delete from producto
delete from presentacion
delete from forma_farmaceutica
delete from laboratorio

--conexiones activas
select * from pg_stat_activity
where datname = 'clinicadb'

SELECT pg_terminate_backend(pid) FROM pg_stat_activity WHERE datname = 'clinicadb';

--PAra actualizar en el servidor de produccion
delete from almacen_producto
where stock_actual = 0
