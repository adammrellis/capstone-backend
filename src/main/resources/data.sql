--Vehicles
INSERT INTO vehicles(year_range,make,model,image) VALUES ('1984-2001','Jeep','Cherokee/Wagoneer XJ','https://www.leithcars.com/blogs/1421/wp-content/uploads/2016/05/449216-1024x680-1024x680.jpg' )
INSERT INTO vehicles(year_range,make,model,image) VALUES ('1993-1998','Jeep','Grand Cherokee ZJ','https://i.pinimg.com/originals/5f/3c/ac/5f3cac103e40947f1d58f3304e046627.jpg' )
INSERT INTO vehicles(year_range,make,model,image) VALUES ('1999-2004','Jeep','Grand Cherokee WJ','https://betterparts.org/images/jeep-grand-cherokee-wj-10.jpg' )
INSERT INTO vehicles(year_range,make,model,image) VALUES ('1986-1992','Jeep','Comanche MJ','https://i.pinimg.com/originals/d4/62/5c/d4625c71696d281da02ba29417654aee.jpg' )
INSERT INTO vehicles(year_range,make,model,image) VALUES ('1997-2006','Jeep','Wrangler TJ','https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ9XkTQGjTNbsUdhhhyarNsRWOB7eN8rKlzJQ-366X60Alfnyds' )
INSERT INTO vehicles(year_range,make,model,image) VALUES ('2004-2006','Jeep','Wrangler LJ','https://www.jeepforum.com/forum/showpic.php?do=showpic&u=187259&a=306904' )


--Parts
INSERT INTO parts(part_name,part_type,image,in_cart,price) VALUES ('3 Link Long-Arm Kit','Front Suspension','https://www.ruffstuffspecialties.com/catalog/graphics/00000001/R1036-CAD-full.jpg',true, 1200)
INSERT INTO parts(part_name,part_type,image,in_cart,price) VALUES ('Rock Sliders for TJ','Chassis Protection','https://cdn.shopify.com/s/files/1/0124/7336/8672/products/img_2059_400x.jpg?v=1569806179',false, 350)
INSERT INTO parts(part_name,part_type,image,in_cart,price) VALUES ('Rock Sliders for XJ','Chassis Protection','https://cdn.shopify.com/s/files/1/0124/7336/8672/products/dsc0681_400x.jpg?v=1569806179',false, 350)
INSERT INTO parts(part_name,part_type,image,in_cart,price) VALUES ('Rock Sliders for LJ','Chassis Protection','https://cdn.shopify.com/s/files/1/0124/7336/8672/products/img_2059_400x.jpg?v=1569806179',false, 350)
INSERT INTO parts(part_name,part_type,image,in_cart,price) VALUES ('Rock Sliders for MJ','Chassis Protection','https://www.quadratec.com/sites/default/files/styles/product_zoomed/public/product_images/rockhard-4x4-zj-rocker-guard-RH7003.jpg',false, 350)
INSERT INTO parts(part_name,part_type,image,in_cart,price) VALUES ('Square Roof Rack','Storage','https://www.cherokeeforum.com/attachments/f58/47219d1304480890t-square-tubing-roof-rack-roofrack-002.jpg',false, 600)
INSERT INTO parts(part_name,part_type,image,in_cart,price) VALUES ('Tube Roof Rack','Storage','https://farm5.staticflickr.com/4444/23868925958_44ef3aa011_b.jpg',false, 800)
INSERT INTO parts(part_name,part_type,image,in_cart,price) VALUES ('Rock Sliders for ZJ','Chassis Protection','https://www.vividracing.com/images/ZRS_0-GWSS.jpg',false, 350)


--Vehicles_Parts
INSERT INTO vehicles_parts(vehicle_id,part_id) VALUES (1,1)
INSERT INTO vehicles_parts(vehicle_id,part_id) VALUES (1,3)
INSERT INTO vehicles_parts(vehicle_id,part_id) VALUES (1,6)
INSERT INTO vehicles_parts(vehicle_id,part_id) VALUES (1,7)
INSERT INTO vehicles_parts(vehicle_id,part_id) VALUES (2,1)
INSERT INTO vehicles_parts(vehicle_id,part_id) VALUES (2,6)
INSERT INTO vehicles_parts(vehicle_id,part_id) VALUES (2,7)
INSERT INTO vehicles_parts(vehicle_id,part_id) VALUES (2,8)
INSERT INTO vehicles_parts(vehicle_id,part_id) VALUES (3,1)
INSERT INTO vehicles_parts(vehicle_id,part_id) VALUES (3,6)
INSERT INTO vehicles_parts(vehicle_id,part_id) VALUES (3,7)
INSERT INTO vehicles_parts(vehicle_id,part_id) VALUES (4,1)
INSERT INTO vehicles_parts(vehicle_id,part_id) VALUES (4,5)
INSERT INTO vehicles_parts(vehicle_id,part_id) VALUES (5,1)
INSERT INTO vehicles_parts(vehicle_id,part_id) VALUES (5,2)
INSERT INTO vehicles_parts(vehicle_id,part_id) VALUES (6,1)
INSERT INTO vehicles_parts(vehicle_id,part_id) VALUES (6,4)

--Users
INSERT INTO users(name,password,admin) VALUES ('Rian1000','hello world', true)
INSERT INTO users(name,password,admin) VALUES ('Nick','hello world', true)
INSERT INTO users(name,password,admin) VALUES ('Aarowhead105','hello world', false)
INSERT INTO users(name,password,admin) VALUES ('Herbie_53','hello world', true)


