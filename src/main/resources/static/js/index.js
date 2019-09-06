var vm = new Vue({
	el: '#container',
	data: {},
	methods: {},
	created: function() {
		let data = {
			username: "username"
		};
		axios.post('http://localhost:9080/shop/show', data).then(res => {
			console.log(res.data.username)
		});
	}
})
