import ecar

import unittest

# This is a test case
# It is a class that inherits from unittest.TestCase
# 用于测试方法的类
# 继承自unittest.TestCase
class TestEcar(unittest.TestCase):
    def test_ecar(self):
        self.assertEqual(ecar.get_name("a", "b"), "a_b")

    def test_show_battry(self):
        my_ecar = ecar.ECar("make", "model", "year", 100)
        self.assertEqual(my_ecar.show_battry(), 1000)

if __name__ == '__main__':
    unittest.main()
