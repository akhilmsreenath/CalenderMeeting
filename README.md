# CalenderMeeting
Designing API for Calender to schedule a meeting
I have plan to design 4 tables for this appliucation
1.Employee
2.Room
3.Meeting
4.EmployeeMeeting

There is a m:n relationship with Employee table and Meeting table.So,I need to create  new table EmployeeMeeting.

How to User our App?

1.Employee(Interview scheduler) can Just check whether Employee is available or not.It will be http get request. 
URL : http://localhost/meeting/{timeslot}/employee/{ID}

2.Employee (Interview scheduler) can just check whether Room is available or not.It will be http get request.
URL: http://localhost/meeting/{timeslot}/Room/{ID}

3.Employee (Interview scheduler) can schedule meeting by providing Employee ID's and Room number
URL: http://localhost/meeting/schedule

