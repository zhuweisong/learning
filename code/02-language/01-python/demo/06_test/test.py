import ecar
import pytest

# This is a test case
# 用于测试方法的类
def test_ecar():
    assert ecar.get_name("a", "b") == "a_b"

def test_show_battry():
    my_ecar = ecar.ECar("make", "model", "year", 100)
    assert my_ecar.show_battry() == 100

# Run the test case
# 运行测试用例, 通过命令行执行
# pytest -s test.py

# 或者  通过代码执行
#pytest.main(["-s", "test.py"])
