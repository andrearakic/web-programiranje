Vue.component('my-login', {
	data: function () {
		    return {
                user : {username:'', password:''}     
		    }
    },
    template:` <div> <section class="container">
    <form class="form-horizontal" role="form" id="login-form">
      <h3 class="regText">SIGN IN</h3>
      <div class="form-group">
        <label for="username" class="col-sm-3 control-label">Username:</label>
        <div class="col-sm-9">
        	<input type="text" v-model="user.username"  placeholder="Username" required id="username">
        </div
      </div>
      <div>
        <label for="password" class="col-sm-3 control-label">Password:</label>
        <div class="col-sm-9">
        	<input type="password" v-model="user.password"  placeholder="********" required id="password">
        </div
      </div>
      <div class="form-group">
        <div class="col-sm-9 col-sm-offset-3">
      		<button type="submit" class="btn btn-primary btn-block" v-on:click="login">Sign in</button>
      		<p>Don't have an account? <a id="dugme" href="http://localhost:8080/WebProject/#/registration">Sign up</a></p> 
      	</div>
      </div>
 
    </form>
    </section>
    </div>		  
`,
methods: {
    login(){
     axios.post('rest/login', this.user)
    .then(function (response) {
        //console.log(response);
        //alert('Uspesno logovanje');
    	app.prijavljen = true;
        router.push('/');        
        
    })
    .catch(function (error) {
        //console.log(error);
        alert('Neuspesno logovanje!');
    
    });
    }
}
  
});

new Vue({
  el: '#log',
  // Opcije Vue instance
})
;
