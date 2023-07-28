package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.LoginModel;
import com.example.demo.Service.LoginService;
import com.example.demo.Model.SignupModel;
import com.example.demo.Service.SignupService;
import com.example.demo.Service.ContactService;
import com.example.demo.Model.ContactModel;
import com.example.demo.Service.PaymentService;
import com.example.demo.Model.PaymentModel;

@RestController
public class LoginController {
	
	@Autowired 
	LoginService stuService;
	@Autowired
	SignupService seService;
	@Autowired
	ContactService cService;
	@Autowired 
	PaymentService pmService;
	
	
	
	@PostMapping("/addDetails")
	public LoginModel addInfo(@RequestBody LoginModel st)
	{
		return stuService.saveDetails(st);
		}
	

	@PostMapping("/addDet")
	public SignupModel addInfo(@RequestBody SignupModel st1)
	{
		return seService.saveDetails(st1);
		}
	
	@PostMapping("/addDetail")
	public ContactModel addInfo(@RequestBody ContactModel cs)
	{
		return cService.saveDetails(cs);
		}
	
	@PostMapping("/AddDetails")
	public PaymentModel addInfo(@RequestBody PaymentModel st)
	{
		return pmService.saveDetails(st);
		}
	
	
	
	@GetMapping("/showDetails")
		public List<LoginModel>fetchDetails(){

			return stuService.getDetails();
			}
	@GetMapping("/showDet")
	public List<SignupModel>fetchDet(){
		return seService.getDetails();
		}
	@GetMapping("/showDetail")
	public List<ContactModel>fetchDetail(){
		return cService.getDetails();
		}
	@GetMapping("/ShowDetail")
	public List<PaymentModel>FetchDetails(){
		return pmService.getDetails();
		}
	
	
	
		@PutMapping("/UpdateDetails")
		public LoginModel UpdateInfo(@RequestBody LoginModel st1){
			
			return stuService.UpdateDetails(st1);
			}
		@PutMapping("/UpdateDet")
		public SignupModel UpdateInfo(@RequestBody SignupModel ss){
			return seService.UpdateDetails(ss);
			}
		@PutMapping("/UpdateDetail")
		public ContactModel UpdateInfo(@RequestBody ContactModel ss1){
			return cService.UpdateDetails(ss1);
			}
		@PutMapping("/updateDetails")
		public PaymentModel UpdateInfo(@RequestBody PaymentModel ss1){
			return pmService.UpdateDetails(ss1);
			}
		
		
		@DeleteMapping("/Dello/{id}")
		public String deleteInfo (@PathVariable("id")int id) {
			stuService.deleteLogin(id);
			return "Deleted details";
			}
		
		@DeleteMapping("/Delete/{id}")
		public String DeleteInfo (@PathVariable("id")int id) {
			seService.deleteDetails(id);
			return "Deleted details";
			}
		
		@DeleteMapping("/Delco/{id}")
		public String deleteinfo (@PathVariable("id")int id) {
			cService.deleteContact(id);
			return "Deleted details";
			}
		
		@DeleteMapping("/Delpay/{id}")
		public String Deleteinfo (@PathVariable("id")int id) {
			pmService.deletePay(id);
			return "Deleted details";
			}
		
		
		}