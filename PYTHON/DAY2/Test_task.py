import unittest
from Task1 import age_checker



class TestTask1Function(unittest.TestCase):
    def test_function_exits(self):
        self.assertTrue(callable(age_checker))




    def test_that_Task1_functon_actually_checks_the_age(self):
       
        result = age_checker(13, 50)
        self.assertEqual(result, 24)

        
        