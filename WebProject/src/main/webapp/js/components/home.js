Vue.component('my-home', {
  // Component options
  data() {
    return {
      message: 'Hello Home!',
    };
  },
  template: `
    <div>
      <h2>Dashboard Component</h2>
      <p>{{ message }}</p>
    </div>
  `,
  
});
