package com.example.scientificcalculator;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.math.BigDecimal;
import java.math.MathContext;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tvmain, tvsec;
    Vibrator vib;
    int res = 0;
    MediaPlayer mp;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,dot,bpi,equal,plus,min,mul,div,inv,sqrt,square,fact,In,log,tan,cos,sin,bb1,bb2,ac,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        vib = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bpi = findViewById(R.id.pi);
        dot = findViewById(R.id.dot);
        equal = findViewById(R.id.equal);
        plus = findViewById(R.id.plus);
        min = findViewById(R.id.min);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        inv = findViewById(R.id.inv);
        sqrt = findViewById(R.id.sqrt);
        square = findViewById(R.id.sqr);
        fact = findViewById(R.id.fac);
        In = findViewById(R.id.in);
        log = findViewById(R.id.log);
        tan = findViewById(R.id.tan);
        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        c = findViewById(R.id.c);
        ac = findViewById(R.id.ac);

        String pi = "3.14159265";
        tvmain = findViewById(R.id.view1);
        tvsec = findViewById(R.id.view2);
        mp = MediaPlayer.create(this, R.raw.click_sound);

       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(res == 1)
               {
                   tvmain.setText("");
                   res = 0;
               }
               tvmain.setText(tvmain.getText() + "1");
               vib.vibrate(100);

           }
       });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res == 1)
                {
                    tvmain.setText("");
                    res = 0;
                }
                tvmain.setText(tvmain.getText()+"2");
                vib.vibrate(100);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res == 1)
                {
                    tvmain.setText("");
                    res = 0;
                }
                tvmain.setText(tvmain.getText()+"3");
                vib.vibrate(100);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res == 1)
                {
                    tvmain.setText("");
                    res = 0;
                }
                tvmain.setText(tvmain.getText()+"4");
                vib.vibrate(100);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res == 1)
                {
                    tvmain.setText("");
                    res = 0;
                }
                tvmain.setText(tvmain.getText()+"5");
                vib.vibrate(100);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res == 1)
                {
                    tvmain.setText("");
                    res = 0;
                }
                tvmain.setText(tvmain.getText()+"6");
                vib.vibrate(100);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res == 1)
                {
                    tvmain.setText("");
                    res = 0;
                }
                tvmain.setText(tvmain.getText()+"7");
                vib.vibrate(100);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res == 1)
                {
                    tvmain.setText("");
                    res = 0;
                }
                tvmain.setText(tvmain.getText()+"8");
                vib.vibrate(100);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res == 1)
                {
                    tvmain.setText("");
                    res = 0;
                }
                tvmain.setText(tvmain.getText()+"9");
                vib.vibrate(100);
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(res == 1)
                {
                    tvmain.setText("");
                    res = 0;
                }
                tvmain.setText(tvmain.getText()+"0");vib.vibrate(100);
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = 0;
                tvmain.setText(tvmain.getText()+".");vib.vibrate(100);
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText("");vib.vibrate(100);
                tvsec.setText("");
                mp.start();

            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                if (val.isEmpty()) {
                    // If the screen is empty, you might want to do nothing or show a message
                    // For example, you could show a toast message to inform the user
                    vib.vibrate(100);
                } else {
                    // If the screen is not empty, remove the last character
                    val = val.substring(0, val.length() - 1);
                    tvmain.setText(val);
                    vib.vibrate(100);
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = 0;
                tvmain.setText(tvmain.getText()+"+");vib.vibrate(100);
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = 0;
                tvmain.setText(tvmain.getText()+"-");vib.vibrate(100);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = 0;
                tvmain.setText(tvmain.getText()+"×");vib.vibrate(100);
            }
        });

        if(div != null) {
            div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    res = 0;
                    tvmain.setText(tvmain.getText() + "÷");
                    vib.vibrate(100);
                }
            });
        }


        if(bb1 != null) {
            bb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    res = 0;
                    tvmain.setText(tvmain.getText() + "(");
                    vib.vibrate(100);
                }
            });
        }
        if(bb2 != null) {
            bb2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    res = 0;
                    tvmain.setText(tvmain.getText() + ")");
                    vib.vibrate(100);
                }
            });
        }
        if(bpi != null) {
            bpi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    res = 0;
                    tvsec.setText(bpi.getText());
                    tvmain.setText(tvmain.getText() + pi);
                    vib.vibrate(100);
                }
            });
        }

        // Assuming sqrt is a Button object
        if (sqrt != null) {
            sqrt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    res = 0;
                    String val = tvmain.getText().toString();
                    if (val.isEmpty()) {
                        vib.vibrate(100);
                        return;
                    }
                    vib.vibrate(100);
                    String expression = "sqrt(" + val + ")";
                    try {
                        BigDecimal result = eval(expression);
                        // Convert BigDecimal to double if necessary
                        double resultDouble = result.doubleValue();
                        tvmain.setText(String.valueOf(resultDouble));
                        tvsec.setText(val + "√");
                    } catch (ArithmeticException e) {
                        tvmain.setText("Error");
                        tvsec.setText("Cannot take square root of a negative number");
                    } catch (Exception e) {
                        tvmain.setText("Error");
                        tvsec.setText("Invalid expression");
                    }
                }
            });

        }


// Assuming sin is a Button object
        if (sin != null) {
            sin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    res = 0;
                    tvmain.setText(tvmain.getText() + "sin");
                    vib.vibrate(100);
                }
            });
        }
    if(cos!= null){
            cos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    res = 0;
                    tvmain.setText(tvmain.getText() + "cos");
                    vib.vibrate(100);
                }
            });
        }

    if (tan != null) {
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = 0;
                tvmain.setText(tvmain.getText() + "tan");
                vib.vibrate(100);
            }
        });
    }

    if(inv != null) {
        inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res = 0;
                tvmain.setText(tvmain.getText() + "^" + "(-1)");
                vib.vibrate(100);
            }
        });
    }
        if(fact != null) {
            fact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    res = 0;
                    // Check if tvmain is empty
                    if (tvmain.getText().toString().isEmpty()) {
                        // Optionally, show a message to the user
                        vib.vibrate(100);
                    } else {
                        int val = Integer.parseInt(tvmain.getText().toString());
                        vib.vibrate(100);
                        int fact = factorial(val);
                        tvmain.setText(String.valueOf(fact));
                        tvsec.setText(val + "!");
                    }
                }
            });
        }

        if(square != null) {
            square.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    res = 0;
                    // Check if tvmain is empty
                    if (tvmain.getText().toString().isEmpty()) {
                        // Optionally, show a message to the user
                        vib.vibrate(100);
                    } else {
                        double d = Double.parseDouble(tvmain.getText().toString());
                        vib.vibrate(100);
                        double square = d * d;
                        tvmain.setText(String.valueOf(square));
                        tvsec.setText(d + "²");
                    }
                }
            });
        }


if(In != null) {
    In.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            res = 0;
            tvmain.setText(tvmain.getText() + "ln");
            vib.vibrate(100);
        }
    });
}

if(log != null) {
    log.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            res = 0;
            tvmain.setText(tvmain.getText() + "log");
            vib.vibrate(100);
        }
    });
}

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                if (val.isEmpty()) {
                    return; // Exit the method if the string is empty
                }
                res = 1;
                vib.vibrate(100);
                String replacedStr = val.replace('÷', '/').replace('×', '*');
                try {
                    BigDecimal result = eval(replacedStr);
                    // Convert BigDecimal to double if necessary
                    // For example, if you need to display the result as a double:
                    double resultDouble = result.doubleValue();
                    // Format the result to show only necessary decimal places
                    // If you need to display the result as a BigDecimal:
                    String formattedResult = result.stripTrailingZeros().toPlainString();
                    tvmain.setText(formattedResult); // Use formattedResult if you want to display BigDecimal
                    // Or use resultDouble if you need to display as a double
                    // tvmain.setText(String.valueOf(resultDouble));
                    tvsec.setText(val);
                } catch (ArithmeticException e) {
                    // Handle division by zero or other arithmetic errors
                    tvmain.setText("Error");
                    tvsec.setText("Division by zero or invalid operation");
                } catch (NumberFormatException e) {
                    // Handle invalid numbers
                    tvmain.setText("Error");
                    tvsec.setText("Invalid number");
                } catch (Exception e) {
                    // Catch-all for other unexpected errors
                    tvmain.setText("Error");
                    tvsec.setText("Invalid expression");
                }
            }
        });




    }

    public static BigDecimal eval(final String str) {
        return new Object() {
            int pos = -1, ch;
            MathContext mc = new MathContext(10); // Adjust precision as needed

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            BigDecimal parse() {
                nextChar();
                BigDecimal x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            BigDecimal parseExpression() {
                BigDecimal x = parseTerm();
                for (;;) {
                    if      (eat('+')) x = x.add(parseTerm(), mc); // addition
                    else if (eat('-')) x = x.subtract(parseTerm(), mc); // subtraction
                    else return x;
                }
            }

            BigDecimal parseTerm() {
                BigDecimal x = parseFactor();
                for (;;) {
                    if      (eat('*')) x = x.multiply(parseFactor(), mc); // multiplication
                    else if (eat('/')) x = x.divide(parseFactor(), mc); // division
                    else return x;
                }
            }

            BigDecimal parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return parseFactor().negate(); // unary minus

                BigDecimal x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = new BigDecimal(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    // Implement function logic here
                    if (func.equals("sqrt")) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                            x = x.sqrt(mc); // mc is the MathContext defined in your eval method
                        }
                    } else if (func.equals("sin")) {
                        double radians = Math.toRadians(x.doubleValue());
                        x = BigDecimal.valueOf(Math.sin(radians));
                    } else if (func.equals("cos")) {
                        double radians = Math.toRadians(x.doubleValue());
                        x = BigDecimal.valueOf(Math.cos(radians));
                    } else if (func.equals("tan")) {
                        double radians = Math.toRadians(x.doubleValue());
                        x = BigDecimal.valueOf(Math.tan(radians));
                    } else if (func.equals("log")) {
                        x = BigDecimal.valueOf(Math.log10(x.doubleValue()));
                    } else if (func.equals("Ln")) {
                        x = BigDecimal.valueOf(Math.log(x.doubleValue()));
                    }
                    // Add similar adjustments for other functions
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = x.pow(parseFactor().intValue(), mc); // exponentiation

                return x;
            }

        }.parse();
    }
    //factorial function
    int factorial(int n)
    {
        return (n==1 || n==0) ? 1 : n*factorial(n-1);
    }


    //eval function

}