import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/meeting")
public class MeetingSchedulerController {

		@RequestMapping(value = "/{TimeSlot}/employee/{ID}", method = RequestMethod.GET)
		public String employeeCheck(ModelMap model) {
		String status ;
		//Check the availibility of Each Employee in meeting class with particular Time Slots and EmployeeId
		
		
			model.addAttribute("status", status);
			return "EmployeeStatus";
		}
		
		@RequestMapping(value = "/{TimeSlot}/room/{ID}", method = RequestMethod.GET)
		public String roomCheck(ModelMap model) {
		String status;
		//Check the availibility of Room in meeting class with particular Time Slot and room number.
		
		
			model.addAttribute("status", status);
			return "EmployeeStatus";
		}
		
		@RequestMapping(value = "schedule", method = RequestMethod.POST)
		public String roomCheck(Meeting meeting,Employee employee,Room room,ModelMap model) {
		//check the availibility of the room and the employees first
		//book a time slot .cretae a new row in meeting table with meeting id.
		
		
			model.addAttribute("status", meeting.msg.success);
			return "Cretae Resource";
		}
		
		
		
		
		
	}
