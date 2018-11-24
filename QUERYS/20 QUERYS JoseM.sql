select * 
from platos;

select plato_nombre, plato_calorias
FROM platos;

SELECT platos, ingredientes
WHERE platos.plato_id=ingredientes.plato_id;


SELECT platos.plato_nombre, ingredientes.ingrediente_nombre
FROM platos

LEFT JOIN ingredientes ON PLATOS.plato_id=ingredientes.plato_id;

SELECT menus_platos.mp_tipo
FROM menus_platos
GROUP BY menus_platos.mp_tipo;

SELECT DISTINCT menus_platos.mp_tipo
FROM menus_platos;

SELECT menus_platos.mp_tipo
FROM menus_platos
GROUP BY menus_platos.mp_tipo
ORDER BY menus_platos.mp_tipo;

SELECT DISTINCT menus_platos.mp_tipo
FROM menus_platos
ORDER BY menus_platos.mp_tipo;

SELECT platos.plato_nombre, menus_platos.mp_tipo
FROM platos, menus_platos
WHERE platos.plato_id=menus_platos.plato_id;

SELECT DISTINCT platos.plato_nombre, menus_platos.mp_tipo
FROM platos, menus_platos
WHERE platos.plato_id=menus_platos.plato_id;

SELECT DISTINCT platos.plato_nombre, menus_platos.mp_tipo
FROM platos, menus_platos
WHERE menus_platos.plato_id=platos.plato_id LIKE (SELECT menus_platos.plato_id 'primero');

SELECT DISTINCT platos.plato_nombre, menus_platos.mp_tipo
FROM platos, menus_platos
WHERE platos.plato_id=menus_platos.plato_id
ORDER BY platos.plato_nombre;

SELECT*
FROM MENUS;

SELECT menus.menu_nombre, menus_platos.plato_id, menus_platos.mp_tipo, platos.plato_nombre
FROM menus, menus_platos, platos
WHERE menus.menu_id=menus_platos.menu_id AND menus_platos.plato_id=platos.plato_id;

SELECT menus.menu_nombre, menus_platos.plato_id, menus_platos.mp_tipo, platos.plato_nombre, platos.plato_calorias
FROM menus, menus_platos, platos
WHERE menus.menu_id=menus_platos.menu_id AND menus_platos.plato_id=platos.plato_id
ORDER BY platos.plato_calorias;

SELECT menus.menu_nombre, menus_platos.plato_id, menus_platos.mp_tipo, platos.plato_nombre, platos.plato_calorias
FROM menus, menus_platos, platos
WHERE menus.menu_id=menus_platos.menu_id AND menus_platos.plato_id=platos.plato_id
ORDER BY menus_platos.mp_tipo, platos.plato_calorias;


SELECT menus.menu_nombre, menus_platos.plato_id, menus_platos.mp_tipo, platos.plato_nombre, platos.plato_calorias
FROM menus, menus_platos, platos
WHERE menus.menu_id=menus_platos.menu_id AND menus_platos.plato_id=platos.plato_id
ORDER BY menus.menu_nombre DESC, menus_platos.mp_tipo, platos.plato_calorias;

SELECT menus.menu_nombre, menus_platos.plato_id, menus_platos.mp_tipo, platos.plato_nombre, platos.plato_calorias
FROM menus, menus_platos, platos
WHERE menus.menu_id=menus_platos.menu_id AND menus_platos.plato_id=platos.plato_id AND menus.menu_nombre LIKE 'lu%'
ORDER BY menus.menu_nombre DESC, menus_platos.mp_tipo, platos.plato_calorias;

SELECT*
FROM platos
LIMIT 10;

SELECT DISTINCT menus.menu_nombre, menus.menu_id, menus_platos.menu_id, menus_platos.plato_id, platos.plato_id, platos.plato_nombre
FROM menus, menus_platos, platos
WHERE menus.menu_id=menus_platos.menu_id AND menus_platos.menu_id=platos.plato_id AND (SELECT platos.plato_nombre LIKE 'pa%')



