// 日付の計算
let maxDate = new Date();
maxDate.setMonth(maxDate.getMonth() + 3);

// Flatpickrの設定
flatpickr('#fromCheckinDateToCheckoutDate', {
    mode: "range",
    locale: 'ja',
    minDate: 'today',
    maxDate: maxDate
});