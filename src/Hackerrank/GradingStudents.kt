package Hackerrank

class GradingStudentsSolution {
    fun gradingStudents(grades: Array<Int>): Array<Int> {

        val numberOfStudents = grades.size
        val adjustedGrades = IntArray(numberOfStudents)

        for (i in 0 until numberOfStudents) {

            var grade = grades[i]
            val failingGrade = grade
            val remainder = 5 - (grade % 5)

            if (remainder < 3) {
                grade += remainder
            }

            if(grade < 40){
                adjustedGrades[i] = failingGrade
            }else{
                adjustedGrades[i] = grade
            }

        }

        return adjustedGrades.toTypedArray()
    }
}