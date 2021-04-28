var Kargo = /** @class */ (function () {
    function Kargo() {
    }
    Kargo.main = function (args) {
        var completeBoy = "";
        for (var p = 0; p < args.length; p++) {
            {
                var total = "";
                var first = parseInt(args[p]);
                var checker = first;
                var j = 1;
                while (((checker / 10 | 0) > 0)) {
                    {
                        j++;
                        checker = (checker / 10 | 0);
                    }
                }
                ;
                var k = "k";
                for (var i = j; i > 0; i--) {
                    {
                        var digit = first % 10;
                        if (digit === 0) {
                            k = "Zero";
                        }
                        if (digit === 1) {
                            k = "One";
                        }
                        if (digit === 2) {
                            k = "Two";
                        }
                        if (digit === 3) {
                            k = "Three";
                        }
                        if (digit === 4) {
                            k = "Four";
                        }
                        if (digit === 5) {
                            k = "Five";
                        }
                        if (digit === 6) {
                            k = "Six";
                        }
                        if (digit === 7) {
                            k = "Seven";
                        }
                        if (digit === 8) {
                            k = "Eight";
                        }
                        if (digit === 9) {
                            k = "Nine";
                        }
                        total = k + total;
                        first = (first / 10 | 0);
                    }
                    ;
                }
                if (p === 0) {
                    completeBoy = total;
                }
                else {
                    completeBoy = completeBoy + "," + total;
                }
            }
            ;
        }
        console.info(completeBoy);
    };
    return Kargo;
}());
Kargo["__class"] = "Kargo";
Kargo.main(null);
