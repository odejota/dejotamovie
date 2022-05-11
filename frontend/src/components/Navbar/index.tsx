import { ReactComponent as GitHubIcon } from 'assets/img/GitHub.svg';
import './styles.css';

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className='djmovie-nav-content'>
          <h1>DejotaMovie</h1>
          <a href="https://github.com/odejota">
            <div className='djmovie-contact-container'>
              <GitHubIcon />
              <p className='djmovie-contact-link'>/odejota</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  )
}

export default Navbar
