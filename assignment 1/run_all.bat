@echo off
title Happy Paws Pet Care System - All Tasks
color 0A

echo ========================================================
echo     HAPPY PAWS PET CARE SYSTEM - KIGALI
echo     Running All 8 Tasks...
echo ========================================================
echo.

echo [Compiling Java Files...]
javac *.java
if errorlevel 1 (
    echo Compilation failed! Make sure Java JDK is installed.
    pause
    exit /b
)
echo Compilation successful!
echo.

echo ========================================================
echo  TASK 1: Pet.java
echo ========================================================
java Pet
echo.

echo ========================================================
echo  TASK 2: Customer.java
echo ========================================================
java Customer
echo.

echo ========================================================
echo  TASK 3: PetHealthRecord.java
echo ========================================================
java PetHealthRecord
echo.

echo ========================================================
echo  TASK 4: Staff.java
echo ========================================================
java Staff
echo.

echo ========================================================
echo  TASK 5: GroomingBill.java
echo ========================================================
java GroomingBill
echo.

echo ========================================================
echo  TASK 6: FoodStock.java
echo ========================================================
java FoodStock
echo.

echo ========================================================
echo  TASK 7: AdoptionCheck.java
echo ========================================================
java AdoptionCheck
echo.

echo ========================================================
echo  TASK 8: HappyPawsReceipt.java
echo ========================================================
java HappyPawsReceipt
echo.

echo ========================================================
echo  ALL 8 TASKS COMPLETED SUCCESSFULLY!
echo ========================================================
echo.
pause
