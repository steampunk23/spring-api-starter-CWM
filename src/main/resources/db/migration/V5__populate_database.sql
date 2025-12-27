INSERT INTO categories (name)
VALUES ('Fruits'),
       ('Vegetables'),
       ('Beverages'),
       ('Snacks'),
       ('Dairy');

INSERT INTO products (name, price, description, category_id)
VALUES ('Apple', 1.20, 'Fresh and juicy red apples, perfect for snacking.', 1),
       ('Banana', 0.50, 'Ripe yellow bananas, sweet and full of potassium.', 1),
       ('Carrot', 0.80, 'Organic carrots, crunchy and rich in vitamins.', 2),
       ('Spinach', 1.00, 'Fresh green spinach leaves, ideal for salads and cooking.', 2),
       ('Orange Juice', 3.50, '100% natural orange juice, no added sugar.', 3),
       ('Green Tea', 4.00, 'Refreshing green tea, rich in antioxidants.', 3),
       ('Potato Chips', 2.00, 'Crispy salted potato chips for quick snacking.', 4),
       ('Chocolate Bar', 1.50, 'Delicious milk chocolate bar with creamy taste.', 4),
       ('Milk', 2.20, 'Fresh whole milk, sourced from local farms.', 5),
       ('Cheddar Cheese', 5.00, 'Aged cheddar cheese, rich and flavorful.', 5);
