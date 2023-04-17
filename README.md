* Database setup: 
  - Install sqlserver and Oracle XE (remember the password you set there FOR THE REST OF YOUR LIFE!)
  - create a connection from the user SYSTEM
  - add a user (I called it DRAGUSIN_C) and grant him all the possible roles and privileges
  - create a new connection from that user, there you will have the results
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