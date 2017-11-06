class RandomInterface implements IncompatibleRandomInterface {
// Simply defines a method for retrieving the next random number
  IncompatibleRandomInterface r;
  public double next() {
    r = new LinearCongruentialGenerator;
    return r.getNextNumber();
  }
}
