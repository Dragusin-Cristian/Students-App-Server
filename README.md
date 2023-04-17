* Install PostgreSQL and PgAdmin, and create a database named "fullstack"
* set the application properties
* For a basic application:
  1. Create the following folder structure:
      - Model
          - model class (Student)
      - Controller
          - controller class (StudentController)
      - Repository
          - repository interface (StudentRepository)
      - Service
          - service interface (StudentService) and class implementation (StudentServiceImpl)
  2. Implement the functionality:
     - StudentService interface (define the methods to override)
     - Override the methods in StudentServiceImpl, and define a private Repository instance (studentRepository)

     - StudentController:
         - declare a private studentService
         - implement the mapping methods