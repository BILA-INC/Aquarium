import { Component } from '@angular/core';
import {EmployeeService} from "./employee/employee.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Welcome to Aquarium';

  constructor(private employeeService: EmployeeService, private router: Router) {}

  ngOnInit(): void {}

  disconnect() {
    this.employeeService.isConnected=0;
    alert("You gonna to be disconnected")
    this.router.navigate(['']);
  };

  connectMessage() {
    if (this.employeeService.isConnected==0) alert("Veuillez (vous inscrire via 'Sign Up' et) vous connecter " +
      "via 'Login' pour plus de details et de fonctionnalités");
  }
}
