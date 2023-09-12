class Person:
    def get_information(self):
        pass

class Student(Person):
    def __init__(self, name, high_school_year):
        self.name = name
        self.high_school_year = high_school_year

    def get_information(self):
        return f"Name: {self.name}, High School Year: {self.high_school_year}"

class ProfessionDecorator(Person):
    def __init__(self, person, profession):
        self.person = person
        self.profession = profession

    def get_information(self):
        return f"{self.person.get_information()}, Profession: {self.profession}"

class Workplace(Person):
    def __init__(self, person, workplace):
        self.persona = person
        self.workplace = workplace

    def get_information(self):
        return f"{self.person.get_information()}, Workplace: {self.workplace}"

if __name__ == "__main__":
    student = Student("Juan Perez", 2020)

    student = ProfessionDecorator(student, "Engineer")

    student = Workplace(student, "Empress ABC")

    print(student.get_information())
