
import unittest
from ..main.TestClass import *
#from TextWrap import wrap
#import sys
#sys.path.append("../Python")  # Adjust the path to import from the parent directory
#from DoorMatChallenge import doorMat
#from TextWrap import wrap


import TextWrap as TextWrap
#import TestClass
wrap = TextWrap.wrap("hellohowareyoudoing", 4)  # Example usage of wrap function
class TestTextWrap(unittest.TestCase):
    def test_wrap(self):
        self.assertEqual(wrap("hellohowareyoudoing", 4), "hell\nohow\narey\noudo\ning")
        self.assertEqual(wrap("abcdefghij", 3), "abc\ndef\nghi\nj")
        self.assertEqual(wrap("a", 1), "a")
        self.assertEqual(wrap("", 1), "")
        self.assertEqual(wrap("1234567890", 5), "12345\n67890")

if __name__ == '__main__':
    unittest.main()
    myclass = TestClass(20)
    myclass.increment()
    print
    #print(wrap("hellohowareyoudoing", 4))  # Example usage of wrap function
    #print(doorMat(3, 5))  # Example usage of doorMat function
    #print(TestClass.TestClass().test_method())  # Example usage of TestClass method