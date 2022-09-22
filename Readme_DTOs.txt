Thuộc tính (DTO)
-------------------------
Account - Tài khoản
+ EmployeeID 		Int
+ Username			String
+ Password			String

Customer - Khách hàng
+ CustomerID		Int
+ CustomerName		String
+ CustomerPhone		String
+ CustomerAddress	String

Employee - Nhân Viên
+ EmployeeID		Int 
+ EmployeeName		String
+ EmployeeAddress	String
+ EmployeePhone		String 
+ EmployeeBirthDay		Date
+ EmployeeSalary		Int

Daily Sale - Khuyến mãi
+ ProductID		Int
+ StartDay			Date
+ EndDay			Date
+ Sales			Float

Product - Sản phẩm
+ ProductID			Int
+ ProductName		String
+ Price			Int

Receipt - Hóa đơn
+ ReceiptID			Int
+ ReceiptDate		Date
+ totalPrice		Float
+ employeeID		Int
+ customerID		Int

ReceiptDetail - Chi tiết hóa đơn
+ ReceiptID			Int
+ ProductID			Int
+ Quantity			Int
+ TotalPrice		Float

Storage - Kho
+ ProductID			Int
+ Quantity			Int
+ Sales			Boolean


Statistics - Thống kê
- ReceiptTotalPrice
- EmployeeTotalSalary
-------------------------
