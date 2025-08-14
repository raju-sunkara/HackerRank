class TestClass:
    def __init__(self, value):
        self.value = value

    def increment(self, amount):
        self.value += amount
        return self.value

    def decrement(self, amount):
        self.value -= amount
        return self.value

    def reset(self):
        self.value = 0
        return self.value
    def get_value(self):
        return self.value
    def print_value(self):
        print(f"Current value: {self.value}")
    
if __name__ == '__main__':
    myclass = TestClass()
    TestClass.increment(10)
    print(myclass.increment(5))
    print(myclass.print_value)  # Should print 25
    