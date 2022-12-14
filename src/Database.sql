Create database PHONE_ACCESORIES;

Use PHONE_ACCESORIES;
--Create table--

Create table EMPLOYEE(
	EmployeeID int NOT NULL,
	EmployeeName nvarchar(1000),
	EmployeeImage nvarchar(1000),
	EmployeeGender nvarchar(10),
	EmployeeAddress nvarchar(1000),
	EmployeePhone nvarchar(20),
	EmployeeWage int
)

Create table ACCOUNT(
	AccountID int NOT NULL,
	EmployeeID int,
	AccountUsername nvarchar(100),
	AccountPassword nvarchar(100),
	AccountPosition nvarchar(20),
)

Create table CATEGORY(
	CategoryID int NOT NULL,
	CategoryName nvarchar(1000)
)

Create table PRODUCT(
	ProductID int NOT NULL,
	ProductName nvarchar(1000),
	ProductImage nvarchar(1000),
	CategoryID int,
	ProductBrand nvarchar(1000),
	ProductWarranties nvarchar(1000),
	ProductStorage int,
	ProductPrice int
)

Create table SALE(
	SaleID int NOT NULL,
	ProductID int,
    SaleName nvarchar(1000),
	SaleRate float,
)

Create table RECEIPT_BILL(
	ReceiptID int NOT NULL,
	EmployeeID int,
	CustomPhone nvarchar(20),
	ReceiptDay int,
	ReceiptTotalPrice int,
	ReceiptPayment nvarchar(100)
)

Create table RECEIPT_DETAIL(
	ReceiptID int,
	ProductID int,
	ReceiptProductNum int,
	ReceiptPrice int,
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
	
-- add data -- 
	


