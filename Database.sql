Create database PHONE_ACCESORIES;

Use PHONE_ACCESORIES;
--Create table--

Create table EMPLOYEE(
	EmployeeID int NOT NULL,
	EmployeeName nvarchar(100),
	EmployeeImage image,
	EmployeeGender nvarchar(5),
	EmployeeAddress nvarchar(500),
	EmployeePhone nvarchar(20),
	EmployeeWage int
)

Create table ACCOUNT(
	AccountID int NOT NULL,
	EmployeeID int,
	AccountUsername nvarchar(20),
	AccountPassword nvarchar(50),
)

Create table CATEGORY(
	CategoryID int NOT NULL,
	CategoryName nvarchar(150)
)

Create table PRODUCT(
	ProductID int NOT NULL,
	ProductName nvarchar(400),
	ProductImage image,
	CategoryID int,
	ProductBrand nvarchar(400),
	ProductWarranties nvarchar(100),
	ProductInStock int,
	ProductPrice int
)

Create table SALE(
	SaleID int NOT NULL,
	ProductID int,
	SaleStart date,
	SaleEnd date, 
	SaleRate float

)
Create table RECEIPT_BILL(
	ReceiptID int NOT NULL,
	EmployeeID int,
	ReceiptDay date,
	ReceiptTotalPrice int
)

Create table RECEIPT_DETAIL(
	ReceiptID int,
	ProductID int,
	ReceiptProductNum int,
	ReceiptBeforePrice int,
	ReceiptAfterPrice int
)

Create table ORDER_BILL(
	OrderID int NOT NULL,
	EmployeeID int,
	OrderDay date,
	OrderTotalPrice int
)

Create table ORDER_DETAIL(
	OrderID int,
	ProductID int,
	OrderProductNum int,
	OrderPrice int
)

Create table STATISTIC(
	StatisticID int NOT NULL,
	StatisticMonth int,
	StatisticSpend int,
	StatisticCollect int
)

Create table STATISTIC_DETAIL(
	StatisticID int,
	ProductID int,
	StatisticSellNum int,
	StatisticOrderNum int,
	StatisticOrderPrice int,
	StatisticBuyPrice int
)

-- Create FK/PK for database --
alter table EMPLOYEE
	add constraint PK_EMPLOYEE primary key(EmployeeID)

alter table ACCOUNT
	add constraint PK_ACCOUNT primary key(AccountID),
		constraint FK_ACCOUNT_EMPLOYEE foreign key (EmployeeID) references EMPLOYEE(EmployeeID)

alter table CATEGORY
	add constraint PK_CATEGORY primary key(CategoryID)

alter table PRODUCT
	add constraint PK_PRODUCT primary key(ProductID),
		constraint FK_PRODUCT_CATEGORY foreign key (CategoryID) references CATEGORY(CategoryID)

alter table SALE
	add constraint PK_SALE primary key(SaleID),
		constraint FK_SALE_PRODUCT foreign key (ProductID) references PRODUCT(ProductID)

alter table RECEIPT_BILL
	add constraint PK_RECEIPT_BILL primary key(ReceiptID),
		constraint FK_RECEIPT_BILL_EMPLOYEE
				foreign key (EmployeeID) references EMPLOYEE(EmployeeID)

alter table RECEIPT_DETAIL
	add constraint FK_RECEIPT_DETAIL_RECEIPT_BILL 
				foreign key (ReceiptID) references RECEIPT_BILL(ReceiptID),
	    constraint FK_RECEIPT_DETAIL_PRODUCT
				foreign key (ProductID) references PRODUCT(ProductID)
	
alter table ORDER_BILL
	add constraint PK_ORDER_BILL primary key(OrderID),
		constraint FK_ORDER_BILL_EMPLOYEE
				foreign key (EmployeeID) references EMPLOYEE(EmployeeID)

alter table ORDER_DETAIL
	add constraint FK_ORDER_DETAIL_ORDER_BILL 
				foreign key (OrderID) references ORDER_BILL(OrderID),
	    constraint FK_ORDER_DETAIL_PRODUCT
				foreign key (ProductID) references PRODUCT(ProductID)

alter table STATISTIC
	add constraint PK_STATISTIC primary key(StatisticID)

alter table STATISTIC_DETAIL
	add constraint FK_STATISTIC_DETAIL_STATISTIC
				foreign key (StatisticID) references STATISTIC(StatisticID),
	    constraint FK_STATISTIC_DETAIL_PRODUCT
				foreign key (ProductID) references PRODUCT(ProductID)
-- add data -- 



