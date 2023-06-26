const Home = { template: '<my-home></my-home>' };
const Login = { template: '<my-login></my-login>' };
const Registration = { template: '<my-registration></my-registration>' };


const router = new VueRouter({
  routes: [
    { path: '/', component: Home },
    { path: '/login', component: Login },
    { path: '/registration', component: Registration }
  ]
});

new Vue({
  el: '#app',
  router,
  methods: {
    goToHome() {
      this.$router.push('/');
    },
    goToLogin() {
      this.$router.push('/login');
    },
    goToRegistration() {
      this.$router.push('/registration');
    }
    
  },
  
});
