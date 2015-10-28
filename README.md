# CalenderMeeting
Designing API for Calender to schedule a meeting

How to User our App?
Replace Localhost with appropriate IP address.

1.Employee(Interview scheduler) can Just check whether Employee is available or not. 
URL : http://localhost/meeting/{timeslot}/employee/{ID}

2.Employee (Interview scheduler) can just check whether Room is available or not.
URL: http://localhost/meeting/{timeslot}/Room/{ID}

3.Employee (Interview scheduler) can schedule a meeting for each Employee
URL: http://localhost/meeting/employee/schedule

4.Employee (Interview scheduler) can schedule a meeting for entire team.
URL: http://localhost/meeting/team/schedule

5.Employee (Interview scheduler) can just check the status of entire team.
URL : http://localhost/meeting/{timeslot}/team/{ID}
