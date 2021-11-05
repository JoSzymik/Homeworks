  /* -----------------------------------------------
  	 Submitted By: Joanna Szymik
 ------------------------------------------------ */

  // a. Write the code to format number 12345.678 in the United Kingdom locale. Keep two digits after the decimal point.

  NumberFormat numberFormat = NumberFormat.getInstance(Locale.UK);
  numberFormat.setMaximumFractionDigits(2);
  System.out.println(numberFormat.format(12345.678));

  // b. Write the code to format number 12345.678 in U.S. currency.

  NumberFormat currencyFormat =
  NumberFormat.getCurrencyInstance(Locale.US);
  System.out.println(currencyFormat.format(12345.678));

  // c. Write the code to parse '12,345.678' into a number.

  NumberFormat numberFormat =
  NumberFormat.getInstance(Locale.US);
try {
  Number number = numberFormat.parse("12,345.678");
  System.out.println(number.doubleValue());
}
catch (java.text.ParseException ex) {
  System.out.println("Parse failed");
}


