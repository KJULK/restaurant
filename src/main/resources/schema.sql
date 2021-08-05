CREATE TABLE item (
  item_id INT AUTO_INCREMENT  PRIMARY KEY,
  item_name VARCHAR(250) NOT NULL,
  item_description VARCHAR(250) NOT NULL,
  item_price DECIMAL
);



CREATE TABLE R_Orders (
  order_number INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  table_number INT,
  order_name VARCHAR(250) NOT NULL,
  total_price DECIMAL,
  order_date TIMESTAMP
);



CREATE TABLE orderitem (
  order_number INT,
  FOREIGN KEY (order_number) REFERENCES R_Orders(order_number),
  item_id INT,
  FOREIGN KEY (item_id) REFERENCES item(item_id),
  order_item_id INT NOT NULL AUTO_INCREMENT  PRIMARY KEY

);



