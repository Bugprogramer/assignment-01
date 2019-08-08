class RnaTranscription {

        String transcribe(String dnaStrand) {
            String result="";
            for(int i=0;i<dnaStrand.length();i++){
                if(dnaStrand.charAt(i)=='G') {
                    result += 'C';
                    continue;
                }
                else if(dnaStrand.charAt(i)=='C') {
                    result += 'G';
                    continue;
                }
                else if(dnaStrand.charAt(i)=='T') {
                    result += 'A';
                    continue;
                }
                else if(dnaStrand.charAt(i)=='A') {
                    result += 'U';
                    continue;
                }
            }
            return result;
        }

    }
