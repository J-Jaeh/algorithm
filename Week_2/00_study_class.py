class Person:
    def __init__(self, param_name):
        self.name = param_name
    # pass # 아무 설명 하기 싫을때 파이썬은 패스..

    def talk(self) :  #...self는 항상 존재해야해
        print("안녕하세요, 제 이름은 ", self.name, "입니다")
person_1 = Person("유재석")

print(person_1.name)
person_1.talk()
person_2 = Person("찐")
