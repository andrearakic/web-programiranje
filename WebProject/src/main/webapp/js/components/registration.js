Vue.component("my-registration", {
  data: function() {
        return {
            user  : { name : '', surname:'', username:'', password:'', cpassword: ''},
        }
    },
   
   template: `<section class="container">
    <form class="form-horizontal" role="form" id="my-form">
      <h3 class="regText">CREATE YOUR ACCOUNT</h3>
      
      <div class="form-group">
        <label for="name" class="col-sm-3 control-label">Name:</label>
        <div class="col-sm-9">
        	<input type="text" v-model = "user.name"  id="name" placeholder="Name" class="form-control" required>
        	<span class="warning" id="name-warning">Please enter first name</span>
        </div>
      </div>
      <div class="form-group">
        <label for="surname" class="col-sm-3 control-label">Surname:</label>
        <div class="col-sm-9">
        	<input type="text" v-model = "user.surname"  placeholder="Surname" class="form-control" required>
        	<span class="warning" id="surname-warning">Please enter last name</span>
        </div>
      </div>
      <div class="form-group">
        <label for="username" class="col-sm-3 control-label">Username:</label>
        <div class="col-sm-9">
        	<input type="text" v-model = "user.username"  id="username"  placeholder="Username" class="form-control" required>
        	<span class="warning" id="username-warning">Please enter username</span>
        </div>
      </div>
      <div class="form-group">
        <label for="password" class="col-sm-3 control-label">Password:</label>
        <div class="col-sm-9">
        	<input type="password" v-model = "user.password"  id="password" placeholder="********" class="form-control" required>
        	<span class="warning" id="pass-warning">Please enter your password</span>
        </div>
      </div>
      <div class="form-group">
        <label for="password" class="col-sm-3 control-label">Confirm password:</label>
        <div class="col-sm-9">
        	<input type="password" v-model = "user.cpassword"  id="cpassword" placeholder="********" class="form-control" required>
        	<span class="warning" id="cpass-warning">Please confirm your password</span>
        	<span class="warning" id="pass-warning2">Passwords do not match</span>
        </div>
      </div>
      <div class="form-group">
      	<label for="gender" class="col-sm-3 control-label">Gender:</label>
      	<div class="col-sm-9">
      		<select class="form-control" id="gender" placeholder="Choose gender">
        	<option value="M">Male</option>
        	<option value="F">Female</option>
      	</select>
      </div>
    </div>
      <div class="form-group">
      	<label for="birthdate" class="col-sm-3 control-label">Date of birth</label>
           <div class="col-sm-9">
             <input type="date" id="birthdate" class="form-control">
           </div>
      </div>
      <div class="form-group">
        <div class="col-sm-9 col-sm-offset-3">
      		<button type="submit" class="btn btn-primary btn-block" v-on:click="reg">Sign up</button>
      	</div>
      </div>
    </form>
  </section> `,

methods: {
    reg(){
        var temp = this;
        var nameWarning = document.getElementById("name-warning");
        var surnameWarning = document.getElementById("surname-warning");
        var usernameWarning = document.getElementById("username-warning");
        var passWarning = document.getElementById("pass-warning");
        var cpassWarning = document.getElementById("cpass-warning");
        var passWarning2 = document.getElementById("pass-warning2");
        
        if (this.user.name=="" ){
           nameWarning.style.display = "inline";
    	   
    	  
    	 
  		} else {
    		nameWarning.style.display = "none";
  		}
  		if(this.user.surname==""){
			 surnameWarning.style.display = "inline";
			
		  }
		  else {
    		surnameWarning.style.display = "none";
  		}
  		if(this.user.username==""){
			 usernameWarning.style.display = "inline";
			
		  }
		  else {
    		usernameWarning.style.display = "none";
  		}
  		if(this.user.password==""){
			 passWarning.style.display = "inline";
		
		  }
		  else {
    		passWarning.style.display = "none";
  		}
  		if(this.user.cpassword==""){
			 cpassWarning.style.display = "inline";
	
		  }
		  else {
    		cpassWarning.style.display = "none";
  		}
        
        
       	if (this.user.password != this.user.cpassword){
          	passWarning2.style.display = "inline";
   
		  }
		  else {
    		passWarning2.style.display = "none";
  		}
  		

        	axios.post('rest/registration', this.user)
        	.then(function (response) {
        	console.log(response);  //vracam ga sa bc
        	alert('Uspesno ste se registrovali!');
        	temp.korisnik  = { name : '', surname:'', username: '', password:'', cpassword: '' }
    	
    	})
    		.catch(function (error) {
        	console.log(error);
        	alert('Neuspesna registracija!');
         });
   		}
   }   
 
    
})

 new Vue({
  el: '#regg',
  // Opcije Vue instance
})
;
