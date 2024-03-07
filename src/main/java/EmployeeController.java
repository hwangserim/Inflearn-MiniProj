
@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

        public EmployeeController(EmployeeService employeeService) {
            this.employeeService = employeeService;
        }

        @PostMapping("/employee")
        public void saveEmployee(@RequestBody EmployeeSaveRequest request) {
            employeeService.saveEmployee(request);
        }

        @GetMapping("/employee")
        public List<EmployeeResponse> getEmployee() {
            return employeeService.getEmployee();
        }

    }
}
