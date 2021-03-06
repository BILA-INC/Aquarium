import { Observable } from "rxjs";
import { PoolService } from "../pool.service";
import { Component, OnInit } from "@angular/core";
import { Router } from '@angular/router';
import {EmployeeService} from "../../employee/employee.service";

@Component({
  selector: "app-pool-list",
  templateUrl: "./pool-list.component.html",
  styleUrls: ["./pool-list.component.css"]
})

export class PoolListComponent implements OnInit {

  pools: Observable<any>;

  constructor(private poolService: PoolService,
              private router: Router, private employeeService: EmployeeService) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.pools = this.poolService.getPoolsList();
  }

  deletePool(id: number) {
    this.poolService.deletePool(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  poolDetails(id: number){
    this.router.navigate(['details/pool', id]);
  }

  detailsAlert() {
    alert("you've to get identified as 'Manager' (gestionnaire) in order to view further details or delete an item!");
  }
}

