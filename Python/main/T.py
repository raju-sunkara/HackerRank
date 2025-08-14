import Python.main.TestClass as TestClass
if __name__ == '__main__':
    
    myclass = TestClass.TestClass(20)
    myclass.increment(10)
    print(myclass.print_value)  # Should print the incremented value