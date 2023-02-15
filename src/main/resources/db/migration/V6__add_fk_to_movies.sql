alter table movies
add constraint fk_gen_id foreign key (genre_id) references genres (id),
add constraint fk_prod_id foreign key (production_id) references productions (id),
add constraint fk_dir_id foreign key (director_id) references directors (id);
