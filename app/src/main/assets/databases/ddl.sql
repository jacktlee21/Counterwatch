CREATE TABLE hero_names
(
  id integer primary key,
  name varchar(100)
);

CREATE TABLE hero_weakness
(
  id integer,
  counter_id integer,
  FOREIGN KEY(id) REFERENCES hero_names(id)
);

