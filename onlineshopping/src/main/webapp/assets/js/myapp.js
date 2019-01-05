$(function(){
	//solving active main problem
	switch(menu){
	
	case 'About Us':
		$('#about').addclass('active');
		break;
	case 'Contact Us':
		$('#contact').addclass('active');
		break;
	case 'All Products':
		$('#listProducts').addclass('active');
		break;
	default:
		$('#listProducts').addclass('active');
		break;
		$('#a_'+menu).addClass('active');
	}
	
	
	
});