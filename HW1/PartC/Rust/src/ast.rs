pub enum Expr {
    Num(i64),
    Add(Box<Expr>, Box<Expr>),
    Sub(Box<Expr>, Box<Expr>),
    Mult(Box<Expr>, Box<Expr>),
    Div(Box<Expr>, Box<Expr>),
}



// Constructors that hide the Box::new calls when building trees.
pub fn num(n: i64) -> Expr {
    Expr::Num(n)
}

pub fn add(left: Expr, right: Expr) -> Expr {
    Expr::Add(Box::new(left), Box::new(right))
}

pub fn sub(left: Expr, right: Expr) -> Expr {
    Expr::Sub(Box::new(left), Box::new(right))
}

pub fn mult(left: Expr, right: Expr) -> Expr {
    Expr::Mult(Box::new(left), Box::new(right))
}

pub fn div(left: Expr, right: Expr) -> Expr {
    Expr::Div(Box::new(left), Box::new(right))
}

impl Expr {
    pub fn eval(&self) -> i64 {
        match self {
            Expr::Num(value) => *value,
            Expr::Add(left, right) => left.eval() + right.eval(),
            Expr::Sub(left, right) => left.eval() - right.eval(),
            Expr::Mult(left, right) => left.eval() * right.eval(),
            Expr::Div(left, right) => left.eval() / right.eval(),
        }
    }
}
