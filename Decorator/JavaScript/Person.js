class Person {
    getInformation() {}
}

class Student extends Person {
    constructor(name, highSchoolYear) {
        super();
        this.name = name;
        this.highSchoolYear = highSchoolYear;
    }

    getInformation() {
        return `Name: ${this.name}, High School Year: ${this.highSchoolYear}`;
    }
}

class ProfessionDecorator extends Person {
    constructor(person, profession) {
        super();
        this.person = person;
        this.profession = profession;
    }

    getInformation() {
        return `${this.person.getInformation()}, Profession: ${this.profession}`;
    }
}

class Workplace extends Person {
    constructor(person, workplace) {
        super();
        this.person = person;
        this.workplace = workplace;
    }

    getInformation() {
        return `${this.person.getInformation()}, Workplace: ${this.workplace}`;
    }
}

const student = new Student("Juan Perez", 2020);
const studentProffesion = new ProfessionDecorator(student, "Engineer");
const completeStudent = new Workplace(studentProffesion, "Empress ABC");

console.log(completeStudent.getInformation());
