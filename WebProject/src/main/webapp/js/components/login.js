Vue.component('my-login', {
  // Component options
  data() {
    return {
      message: 'Hello Login!',
    };
  },
  template: `
    <div>
      <h2>Login Component</h2>
      <p>{{ message }}</p>
    </div>
  `,
  
});
