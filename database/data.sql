-- Inserciones para la tabla ninja

USE naruto_rober_barreto;

INSERT INTO ninja VALUES 
    ('11','Naruto','Jefe','Aldea de Konoha'),
    ('22','Phineas','Cuidador','Aldea de la construccion'),
    ('33','Batman','Vigilante','Aldea de la noche');

-- Inserciones para la tabla mision
INSERT INTO mision (descripcion,rango,recompensa) VALUES 
    ('Matar el dragón','Jefe', 'Una barbacoa de dragón'),
    ('Construir un rascacielos','Cuidador', 'Las escrituras del terreno'),
    ('Capturar 3 ladrones','Vigilante', 'Un pollo frito con gaseosa');

-- Inserciones para la tabla misionninja
INSERT INTO misionninja (id_ninja, id_mision) VALUES 
    ('11', 1),
    ('22', 2),
    ('11', 3);

-- Inserciones para la tabla habilidad
INSERT INTO habilidad VALUES 
    ('11','Correr agachado','Correr rapido haciendo sus brazos hacia atrás'),
    ('22','Imaginacion para construir','Se las ingenia para construir cosas nuevas cada dia'),
    ('33','Castigar corruptos','Atrapa y castiga a quien haga el mal');

