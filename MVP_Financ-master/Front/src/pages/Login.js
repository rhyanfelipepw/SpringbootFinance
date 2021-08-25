import styled from 'styled-components';
import Logo from '../img/logo.png';
import {Link} from 'react-router-dom';

const LoginBody = styled.div `
    width: 100vw;
    height: 100vh;
    display: flex;
    flex-flow: column wrap;
    align-items: center;
    justify-content: space-aroud;

    .img-login{
        width: 15%;
        height: 15%;
        padding: 2%;
        margin: 3%;
    }

    img {
        width: 100%;
        height: 100%;
    }
`;

const Caixa = styled.div `
    width: 55%;
    height: 55%;
    border-radius: 15px;
    display: flex;
    box-shadow: rgba(0, 0, 0, 0.19) 0px 10px 20px, rgba(0, 0, 0, 0.23) 0px 6px 6px;
`;

const DivVerde = styled.div `
    width: 45%;
    height: 100%;
    background: #8DB892;
    border-radius: 0px 15px 15px 0px;
    display: flex;
    flex-flow: column wrap;
    justify-content: space-evenly;
    align-items: center;
    text-align: center;

    h2 {
        color: white;
    }

    p {
        margin-top: 1.2em;
        color: white;
        font-size: 1.1em;
    }

    button {
        width: 100%;
        height: 100%;
        color: #8DB892;
        background: white;
        border: 2px solid transparent;
        font-size: 1.2em;
        border-radius: 5px;
        transition: .5s;

        :hover {
            background: #8DB892;
            color: white;
            border: 2px solid white;
        }

    }

    a {
        height: 10%;
        width: 30%;
        cursor: pointer;
    }
`;

const DivBranca = styled.div `
    width: 55%;
    height: 100%;
    background: white;
    border-radius: 15px 0px 0px 15px; 
    display: flex;
    flex-flow: column nowrap;
    justify-content: space-around;
    align-items: center;

    h2 {
        color: #04660E;
    }

    form {
        width: 100%;
        height: 20%;
        display: flex;
        flex-flow: column nowrap;
        justify-content: space-around;
        align-items: center;

        label {
            margin-left: 4px;
        }

        .input-login {
            padding: 2%;
            margin: 1em;
            width: 50%;
            border: 1px solid transparent;
            outline: none;
            border-radius: 5px;
            box-shadow: rgba(0, 0, 0, 0.16) 0px 3px 6px, rgba(0, 0, 0, 0.23) 0px 3px 6px;

            :focus{
                border: 2px solid #8DB892;
            }
        }
    }

    button {
        width: 100%;
        height: 100%;
        color: white;
        background: #8DB892;
        border: 2px solid transparent;
        font-size: 1.2em;
        border-radius: 5px;
        transition: .5s;

        :hover {
            background: white;
            color: #8DB892;
            border: 2px solid #8DB892;
        }

    }

    a {
        height: 10%;
        width: 30%;
        cursor: pointer;
    }
`;

function Login () {
    return(
        <>
        <LoginBody>
            <div className="img-login">
                <Link to ="/">
                    <img src={Logo} alt="Logo Financ" />
                </Link>
            </div>
            <Caixa>
                <DivBranca>
                    <h2>Login</h2>
                    <form>
                        <input className="input-login" type="text" placeholder="RA ou Email" />
                        <input className="input-login" type="password" placeholder="Senha" />
                        <div style={{marginTop: '1em'}}>
                            <input type="checkbox" id="showPassword" />
                            <label for="showPassword">Mostrar senha</label> 
                        </div>   
                    </form>
                    <Link to="/">
                        <button>Logar</button>
                    </Link>     
                </DivBranca>


                <DivVerde>
                    <div style={{width: '80%'}}>
                        <h2>Não possui conta? Cadastre-se!</h2>
                        <p>Insira seus dados e começe a controlar suas finanças!</p>
                    </div>
                    <Link to="/cadastro">
                        <button>Cadastre-se!</button>
                    </Link>
                </DivVerde>    
            </Caixa>
        </LoginBody>
        </>
    )
}

export default Login;