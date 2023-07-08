# В подключенном MySQL репозитории создать базу данных “Друзья
# человека”

#CREATE SCHEMA Друзья_человека;
#USE Друзья_человека;

# Таблица пород, чтобы не было ошибок в их занесении
-- CREATE TABLE IF NOT EXISTS species(
#	species_id INT PRIMARY KEY auto_increment,
--    species_name VARCHAR(100));
 DROP TABLE camels;
 DROP  TABLE cats;
 DROP table dogs;
 drop table donkeys;
 drop table hamsters;
 drop table horses;

CREATE TABLE IF NOT EXISTS cats(
	cat_id INT PRIMARY KEY auto_increment,
    cat_name VARCHAR(50),
    -- species_id INT, # Порода
    weight FLOAT(3, 1),
    gender VARCHAR(1),
    date_of_birth Date,
    commands VARCHAR(500));
    
    
CREATE TABLE IF NOT EXISTS dogs(
	dog_id INT PRIMARY KEY auto_increment,
    dog_name VARCHAR(50),
    -- species_id INT, # Порода
    weight FLOAT(4, 1),
    gender VARCHAR(1),
    date_of_birth Date,
    commands VARCHAR(500));    
    

CREATE TABLE IF NOT EXISTS hamsters(
	hamster_id INT PRIMARY KEY auto_increment,
    hamster_name VARCHAR(50),
    -- species_id INT, # Порода
    weight FLOAT(2, 1),
    gender VARCHAR(1),
    date_of_birth Date,
    commands VARCHAR(500));
    
    
CREATE TABLE IF NOT EXISTS horses(
	horse_id INT PRIMARY KEY auto_increment,
    horse_name VARCHAR(50),
    load_capacity INT,
   -- species_id INT, # Порода
    weight FLOAT(4, 1),
    gender VARCHAR(1),
    date_of_birth Date,
    commands VARCHAR(500));
    
    
CREATE TABLE IF NOT EXISTS donkeys(
	donkey_id INT PRIMARY KEY auto_increment,
    donkey_name VARCHAR(50),
    load_capacity INT,
   -- species_id INT, # Порода
    weight FLOAT(4, 1),
    gender VARCHAR(1),
    date_of_birth Date,
    commands VARCHAR(500));
    
    
CREATE TABLE IF NOT EXISTS camels(
	camel_id INT PRIMARY KEY auto_increment,
    camel_name VARCHAR(50),
    load_capacity INT,
   -- species_id INT, # Порода
    weight FLOAT(4, 1),
    gender VARCHAR(1),
    date_of_birth Date,
    commands VARCHAR(500));
    
    
CREATE TABLE IF NOT EXISTS pack_animals (
	pack_animal_id INT PRIMARY KEY auto_increment,
    pack_animal_name VARCHAR(50),
    load_capacity INT,
   -- species_id INT, # Порода
    weight FLOAT(4, 1),
    gender VARCHAR(1),
    date_of_birth Date,
    commands VARCHAR(500));
    
CREATE TABLE IF NOT EXISTS pets (
	pet_id INT PRIMARY KEY auto_increment,
    pet_name VARCHAR(50),
   -- species_id INT, # Порода
    weight FLOAT(4, 1),
    gender VARCHAR(1),
    date_of_birth Date,
    commands VARCHAR(500));
    
CREATE TABLE IF NOT EXISTS animals (
	animal_id INT PRIMARY KEY auto_increment,
    animal_name VARCHAR(50));
    
    # 9. Заполнить низкоуровневые таблицы именами(животных), командами, которые они выполняют и датами рождения
INSERT INTO cats VALUES (1,"Барсик", 3.5, "m", "2021-10-01", "сидеть, прыжок, кувырок"),
						(2,"Чешир", 5.7,"m", "2022-01-07", "сидеть, кувырок"),
                        (3,"Бусинка", 4.6, "f", "2020-01-07", "сидеть");
                     
                     
INSERT INTO dogs VALUES (1,"Черныш", 13.5, "m", "2019-05-01", "сидеть, голос"),
						(2,"Рекс", 10.7,"m", "2018-01-09", "сидеть, кувырок, дай лапу"),
                        (3,"Тайга", 4.6, "f", "2023-05-07", "-");
                        
                        
INSERT INTO hamsters VALUES (1,"Зюзя", 0.51, "m", "2023-05-01", "бегать в колесе"),
						(2,"Пухля", 0.93, "m", "2023-01-09", "прыгать"),
                        (3,"Грызун", 0.61, "m", "2023-05-07", "грызть");


INSERT INTO horses VALUES (1,"Туз", 80, 750.8, "m", "2020-04-01", "галоп"),
						(2,"Ветер", 85, 789.9, "m", "2019-11-30", "прыгать"),
                        (3,"Красавица", 54, 501.6, "f", "2021-06-27", "бежать");
                        
                        
INSERT INTO donkeys VALUES (1,"Упрямый", 400, 210.0, "m", "2020-09-13", "тянуть"),
						(2,"Ушастик", 0, 9.9, "m", "2023-06-09", "прыгать"),
                        (3,"Умница", 350, 276.6, "f", "2021-05-07", "прыгать, тянуть");
                        
                        
INSERT INTO camels VALUES (1,"Роза пустыни", 260, 546.7, "f", "2009-09-14", "сделать круг"),
						(2,"Тягач", 375, 750.9, "m", "2016-10-07", "прыгать"),
                        (3,"Мираж", 335, 676.8, "m", "2020-05-11", "бежать");
                        
					
# 10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. 
# Объединить таблицы лошади, и ослы в одну таблицу.

DELETE FROM camels WHERE camel_id > 0;
CREATE TABLE horses_and_donkeys AS SELECT * FROM horses UNION SELECT * FROM donkeys;

# Создать новую таблицу “молодые животные”,
# в которую попадут все животные старше 1 года, но младше 3 лет
# и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице


CREATE TABLE young_animals AS 
					    SELECT horse_name,
                          CONCAT(DATEDIFF(CURRENT_DATE(),horses_and_donkeys.date_of_birth) DIV 366, "год(-а, лет)", (MOD(DATEDIFF(CURRENT_DATE(),horses_and_donkeys.date_of_birth),366) DIV 30), "мес." ) AS age 
						    FROM horses_and_donkeys WHERE datediff(CURRENT_DATE(), horses_and_donkeys.date_of_birth) / 366 <= 3 AND datediff(CURRENT_DATE(), horses_and_donkeys.date_of_birth) / 366 >= 1
					UNION 
						SELECT cat_name,
						   CONCAT(datediff(CURRENT_DATE(), cats.date_of_birth) DIV  366, "год(-а, лет)", (MOD(datediff(CURRENT_DATE(), cats.date_of_birth),366) DIV 30), "мес." ) AS age
							 FROM cats WHERE datediff(CURRENT_DATE(), cats.date_of_birth) / 366 <= 3 AND datediff(CURRENT_DATE(), cats.date_of_birth) / 366 >= 1
					UNION
                        SELECT dog_name,
                           CONCAT(datediff(CURRENT_DATE(), dogs.date_of_birth) DIV 366, "год(-а, лет)", (MOD(datediff(CURRENT_DATE(), dogs.date_of_birth),366) DIV 30), "мес." ) AS age
                             FROM dogs WHERE datediff(CURRENT_DATE(), dogs.date_of_birth) / 366 <= 3 AND datediff(CURRENT_DATE(), dogs.date_of_birth) / 366 >= 1
				    UNION
					    SELECT hamster_name,
						   CONCAT(datediff(CURRENT_DATE(), hamsters.date_of_birth) DIV 366, "год(-а, лет)", (MOD(datediff(CURRENT_DATE(), hamsters.date_of_birth),366)DIV 30), "мес." ) AS age
                             FROM hamsters WHERE datediff(CURRENT_DATE(), hamsters.date_of_birth) / 366 <= 3 AND datediff(CURRENT_DATE(), hamsters.date_of_birth) / 366 >= 1;
				    

    

    SET sql_notes = 0;      -- Temporarily disable the "Table already exists" warning

