select * from platos;
select plato_id, plato_calorias
from platos;
select plato_id, ingrediente_nombre
from ingredientes;

select platos.plato_id, ingredientes.plato_id
from ingredientes
inner join platos
on ingredientes.plato_id=platos.plato_id;
