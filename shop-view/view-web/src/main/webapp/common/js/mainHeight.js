// --------------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------------
//     描述： 自适应高度
//   依赖于:  jQuery library;
//     作者:  林卿;
//     邮箱： linqing@allinpay.com
//     日期： 2014-01-02
// --------------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------------
// START

if (typeof allinpay !== 'object') var allinpay = {};
allinpay.mainHeight = function(el) {

	
	this.init = function() {
		var mainH = $(window).height()-98;
		$(el).height(mainH)
	}
};

// --------------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------------
// END

$(function() {
	(new allinpay.mainHeight(".main")).init();
	$(window).resize(function(){
		(new allinpay.mainHeight(".main")).init();
	})
});